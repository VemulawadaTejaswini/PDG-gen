import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();

for(int i = 0; i<3;i++ ){
	int box[]=null;
	int s = 0,t=0;
	box[0]=x;
	box[1]=y;
	box[2]=z;
	box[i]=s;
	box[i+1]=t;
	if(box[i]>box[i+1]){
		box[i+1]=s;
		box[i]=t;
	}
}
}
}