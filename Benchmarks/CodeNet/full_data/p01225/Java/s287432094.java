import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<Main> {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < count ; i++){
			String[] nums = sc.nextLine().split(" ");
			String[] colors = sc.nextLine().split(" ");

			ArrayList<Main> tehuda = new ArrayList<Main>();

			for(int j = 0;j < nums.length; j++ ) {
				Main card = new Main(Integer.parseInt(nums[j]), colors[j]);
				tehuda.add(card);
			}
			Collections.sort(tehuda, new Main());

			ArrayList<Integer> cardSet = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> cSetList = new ArrayList<ArrayList<Integer>>();


			String checkColor = tehuda.get(0).getColor();
			for(int j = 0;j < tehuda.size();j++) {
				if(!tehuda.get(j).getColor().equals(checkColor)) {
					cardSet = new ArrayList<Integer>();
					checkColor = tehuda.get(j).getColor();
				}
				cardSet.add(tehuda.get(j).getNum());
				cSetList.add(cardSet);
			}

			int point = 0;

			for(int j = 0;j < cSetList.size(); j++) {
				for(int y = 0;y < cSetList.get(j).size() - 2;y++){
					int num1 = cSetList.get(j).get(y);
					int num2 = cSetList.get(j).get(y + 1);
					int num3 = cSetList.get(j).get(y + 2);
					if((num1 == num2 + 1 && num1 == num3 + 2) || (num1 == num2 && num1 == num3)) {
						point++;
						y += 2;
					}
				}
			}
			if(point == 3) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

	private int num;
	private String color;

	//??????????????????????????????
	Main (int num, String color) {
		this.num = num;
		this.color = color;
	}

	Main() {
	}

	public int getNum() {
		return this.num;
	}

	public String getColor () {
		return this.color;
	}

	@Override
	public  int compare(Main card1 ,Main card2) {
		int num1 = card1.getNum();
		int num2 = card2.getNum();
		String color1 = card1.getColor();
		String color2 = card2.getColor();

		if(color1.compareTo(color2) > 0 && num1 > num2) {
			return 2;
		} else if (color1.compareTo(color2) > 0) {
			return 1;
		} else if (color1.compareTo(color2) == 0 && num1 > num2) {
			return 0;
		} else if (color1.compareTo(color2) == 0 ) {
			return -1;
		} else if (color1.compareTo(color2) < 0 && num1 > num2) {
			return -2;
		} else {
			return -3;
		}

	}


}