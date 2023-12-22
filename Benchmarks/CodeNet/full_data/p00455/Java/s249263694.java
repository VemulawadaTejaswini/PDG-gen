import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.calculationTimeCard();
		return;
	}
	
	//タイムカードの計算処理
	private void calculationTimeCard() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			Calendar attendanceTimeA = Calendar.getInstance(); //Aの出社時刻
			Calendar leavingTimeA = Calendar.getInstance(); //Aの退社時刻
			Calendar attendanceTimeB = Calendar.getInstance(); //Bの出社時刻
			Calendar leavingTimeB = Calendar.getInstance(); //Bの退社時刻
			Calendar attendanceTimeC = Calendar.getInstance(); //Bの出社時刻
			Calendar leavingTimeC = Calendar.getInstance(); //Bの退社時刻
			
			//カレンダーをリストにする
			LinkedList<Calendar> attendanceTimeCalendarList = new LinkedList<Calendar>(); //出社時間のリスト
			LinkedList<Calendar> leavingTimeCalendarList = new LinkedList<Calendar>(); //退社時刻のリスト
			attendanceTimeCalendarList.add(attendanceTimeA);
			leavingTimeCalendarList.add(leavingTimeA);
			attendanceTimeCalendarList.add(attendanceTimeB);
			leavingTimeCalendarList.add(leavingTimeB);
			attendanceTimeCalendarList.add(attendanceTimeC);
			leavingTimeCalendarList.add(leavingTimeC);
			
			//カレンダーに出退勤の時刻を入力する
			for (int i = 0; i < 3; i++) {
				
				String inputStr = bufferedReader.readLine();
				String[] inputStrs = inputStr.split(" ");
				int attendanceTimeHour = Integer.parseInt(inputStrs[0]);
				int attendanceTimeMinute = Integer.parseInt(inputStrs[1]);
				int attendanceTimeSecond = Integer.parseInt(inputStrs[2]);
				int leavingTimeHour = Integer.parseInt(inputStrs[3]);
				int leavingTimeMinute = Integer.parseInt(inputStrs[4]);
				int leavingTimeSecond = Integer.parseInt(inputStrs[5]);
				
				attendanceTimeCalendarList.get(i).set(2014, 4, 1, attendanceTimeHour, attendanceTimeMinute, attendanceTimeSecond);
				leavingTimeCalendarList.get(i).set(2014, 4, 1, leavingTimeHour, leavingTimeMinute, leavingTimeSecond);
			}
			
			//勤務時間を計算する
			LinkedList<Calendar> workingHoursList = new LinkedList<Calendar>(); //勤務時間のリスト
			for (int i = 0; i < 3; i++) {
				
				workingHoursList.add(Calendar.getInstance());
				
				//退社時刻と出社時刻の差分を求める
				long workingHour = leavingTimeCalendarList.get(i).getTimeInMillis() - attendanceTimeCalendarList.get(i).getTimeInMillis() - workingHoursList.get(i).getTimeZone().getRawOffset();
				workingHoursList.get(i).setTimeInMillis(workingHour);
				
			}
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H mm ss");
			for (int i = 0; i < 3; i++) {
				String workingHourStr = simpleDateFormat.format(workingHoursList.get(i).getTime());
				System.out.println(workingHourStr);
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}