import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int e = scan.nextInt();
			if(e==0){
				break;
			}
			int m=10000000;
			for(int z=0;z<100;z++){
				for(int y=0;y<1000;y++){
					for(int x=0;x<100;x++){
						if(x+(y*y)+(z*z*z)==e){
							if(x+y+z<m){
								m=x+y+z;
							}
						}
					}
				}
			}
			System.out.println(m);
		}
	}

}