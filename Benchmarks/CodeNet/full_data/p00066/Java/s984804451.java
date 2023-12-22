import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]==c[1]&&c[1]==c[2]){
				System.out.println(c[0]);
			}else if(c[3]==c[4]&&c[4]==c[5]){
				System.out.println(c[3]);
			}else if(c[6]==c[7]&&c[7]==c[8]){
				System.out.println(c[6]);
			}else if(c[0]==c[3]&&c[3]==c[6]){
				System.out.println(c[0]);
			}else if(c[1]==c[4]&&c[4]==c[7]){
				System.out.println(c[1]);
			}else if(c[2]==c[5]&&c[5]==c[8]){
				System.out.println(c[2]);
			}else if(c[0]==c[4]&&c[4]==c[8]){
				System.out.println(c[0]);
			}else if(c[2]==c[4]&&c[4]==c[6]){
				System.out.println(c[2]);
			}else{
				System.out.println("d");
			}
		}
	}
}