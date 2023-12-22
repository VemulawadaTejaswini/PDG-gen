import java.util.Scanner;
public class Main

 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int w = sc.nextInt();int H = sc.nextInt();
	int x = sc.nextInt();int y = sc.nextInt();
	int r = sc.nextInt();
	if(y >= r && y <=H-r && x >=r && x <= w-r ){
		System.out.printf("Yes\n");
	}else{
		System.out.printf("No\n");
	}
	

}
}

