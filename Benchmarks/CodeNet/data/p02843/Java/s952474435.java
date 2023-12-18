import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int x = sc.nextInt();
		int ama = x%100;
		int ichi = ama%10;
		Integer[] array = new Integer[6];
		for(int i=0;6>i;i++) {
			array[i]=0;
		}
		while(true) {
			if(ama%100==0)
				break;
			if(ichi==0)
				ichi=10;
			if(ama-5>=0) {
				array[5]=array[5]+1;
				ama=ama-5;
			}
			else if(ama-4>=0) {
				array[4]=array[4]+1;
				ama=ama-4;
			}
			else if(ama-3>=0) {
				array[3]=array[3]+1;
				ama=ama-3;
			}
			else if(ama-2>=0) {
				array[2]=array[2]+1;
				ama=ama-2;
			}
			else if(ama-1>=0) {
				array[1] = array[1]+1;
				ama=ama-1;
			}
			ichi = ama%10;
			//System.out.println(ama);
		}
		int count=0;
		for(int i=0;6>i;i++) {
			if(i==1)
				count=count+101*array[i];
			else if(i==2)
				count=count+102*array[i];
			else if(i==3)
				count=count+103*array[i];
			else if(i==4)
				count=count+104*array[i];
			else if(i==5)
				count=count+105*array[i];
		}
		if(count+100<x)
			System.out.println("1");
		else
			System.out.println("0");
	}
}