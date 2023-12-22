import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int taro=0,hanako=0;
		String tcard,hcard;
		for(int i=0;i<n;i++){
			tcard=scan.next();
			hcard=scan.next();
			if(tcard.compareTo(hcard)<0){
				hanako+=3;
			}else if(0<tcard.compareTo(hcard)){
				taro+=3;
			}else{
				hanako+=1;
				taro+=1;
			}
		}
		System.out.printf("%d %d\n",taro,hanako);
		scan.close();
	}
}