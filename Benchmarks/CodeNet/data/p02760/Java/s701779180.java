import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Masu{

	int number;
	List<String>line;

	Masu(int number,List<String>line){
		this.number = number;
		this.line= line;
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		List<String>list1=new ArrayList<String>();
		list1.add("tate1");
		list1.add("yoko1");
		list1.add("naname1");
		Masu a = new Masu(num1,list1);

		int num2 = scan.nextInt();
		List<String>list2=new ArrayList<String>();
		list1.add("tate2");
		list1.add("yoko1");
		//list1.add("naname1");
		Masu b = new Masu(num2,list2);

		int num3 = scan.nextInt();
		List<String>list3=new ArrayList<String>();
		list1.add("tate3");
		list1.add("yoko1");
		list1.add("naname2");
		Masu c = new Masu(num3,list3);

		int num4 = scan.nextInt();
		List<String>list4=new ArrayList<String>();
		list1.add("tate1");
		list1.add("yoko2");
		//list1.add("naname1");
		Masu d = new Masu(num4,list4);

		int num5 = scan.nextInt();
		List<String>list5=new ArrayList<String>();
		list1.add("tate2");
		list1.add("yoko2");
		list1.add("naname1");
		list1.add("naname2");
		Masu e = new Masu(num5,list5);

		int num6 = scan.nextInt();
		List<String>list6=new ArrayList<String>();
		list1.add("tate3");
		list1.add("yoko2");
		//list1.add("naname2");
		Masu f = new Masu(num6,list6);

		int num7 = scan.nextInt();
		List<String>list7=new ArrayList<String>();
		list1.add("tate1");
		list1.add("yoko3");
		list1.add("naname2");
		Masu g = new Masu(num7,list7);

		int num8 = scan.nextInt();
		List<String>list8=new ArrayList<String>();
		list1.add("tate2");
		list1.add("yoko3");
		//list1.add("naname1");
		Masu h = new Masu(num8,list8);

		int num9 = scan.nextInt();
		List<String>list9=new ArrayList<String>();
		list1.add("tate3");
		list1.add("yoko3");
		list1.add("naname1");
		Masu i = new Masu(num9,list9);


		List<Masu>masuList= new ArrayList<>();
		masuList.add(a);
		masuList.add(b);
		masuList.add(c);
		masuList.add(d);
		masuList.add(e);
		masuList.add(f);
		masuList.add(g);
		masuList.add(h);
		masuList.add(i);

		int tate1count=0;
		int tate2count=0;
		int tate3count=0;
		int yoko1count=0;
		int yoko2count=0;
		int yoko3count=0;
		int naname1count=0;
		int naname2count=0;


		int N = scan.nextInt();

		for(int l=0;l<N;l++) {
			int ball = scan.nextInt();
			for(Masu masu:masuList) {
				if(masu.number == ball) {
					for(String s:masu.line) {
						switch (s) {
						case "tate1":
							tate1count++;
							break;
						case "tate2":
							tate3count++;
							break;
						case "tate3":
							tate3count++;
							break;
						case "yoko1":
							yoko1count++;
							break;
						case "yoko2":
							yoko2count++;
							break;
						case "yoko3":
							yoko3count++;
							break;
						case "naname1":
							naname1count++;
							break;
						case "naname2":
							naname2count++;
							break;


						default:
							break;
						}
					}
				}
			}
		}

		if(tate1count==3||tate2count==3||tate3count==3||yoko1count==3||yoko2count==3||yoko3count==3||naname1count==3||naname2count==3) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}