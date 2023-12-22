import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){

		int count = 0;
		String mojiretu = null;
		String temp = "";
		try {
			FileInputStream file = new FileInputStream("input.txt");//プロジェクトフォルダ直下にファイルを配置
			BufferedReader readFile    = new BufferedReader(new InputStreamReader(file, "Shift_JIS"));
			count = Integer.parseInt(readFile.readLine());
			mojiretu = readFile.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch(IOException e){
			System.out.println("IOException");
		}

		for(int i =0;i<count;i++){
			int cnt = 0;
			char chk;
			for(int j=0;j<mojiretu.length();j++){
				chk = mojiretu.charAt(j);
				if(chk == mojiretu.charAt(j)){
					cnt++;
				}
				if((j+1) >= mojiretu.length()){
					temp = temp.concat(Integer.toString(cnt));
					temp = temp.concat(Character.toString(chk));
					break;
				}
				if(chk != mojiretu.charAt(j+1)){
					temp = temp.concat(Integer.toString(cnt));
					cnt = 0;
					temp = temp.concat(Character.toString(chk));
				}
			}
			mojiretu = temp;
		}
		System.out.println(mojiretu);
	}
}