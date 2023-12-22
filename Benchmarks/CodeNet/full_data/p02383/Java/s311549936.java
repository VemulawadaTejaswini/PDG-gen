import java.util.Scanner;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int[] index=new int[6];
	public static void main(String[] args){
		for(int i=0;i<index.length;i++){
			index[i]=sc.nextInt();
		}
		String command=sc.next();
		for(int i=0;i<command.length();i++){
			move(command.charAt(i));
		}
		System.out.println(index[0]);
	}
	private static void move (char c){
		switch(c){
		case 'E':
			index[0]=index[3];
			index[2]=index[0];
			index[5]=index[2];
			index[3]=index[5];
			break;
		case 'W':
			index[0]=index[2];
			index[2]=index[5];
			index[5]=index[3];
			index[3]=index[0];
		case 'N':
			index[0]=index[1];
			index[4]=index[0];
			index[5]=index[4];
			index[1]=index[5];
		case 'S':
			index[0]=index[4];
			index[4]=index[5];
			index[5]=index[1];
			index[1]=index[0];
		}
	}
}