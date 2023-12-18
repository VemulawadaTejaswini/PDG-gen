import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //何個とるか
		int num = sc.nextInt();
		//青いボールの数
		int blue = sc.nextInt();
		//赤いボールの数
		int red = sc.nextInt();
		//赤+青が割り切れるか
        int n = num/(blue+red);
      	//赤+青の余り
        int amari=num%(blue+red);
      	//端数がマイナスの場合、amariを足した数を出力
      	if(amari - blue<=0){
         	 System.out.println(blue*n+amari);
        //端数がプラスの場合、青いボールの個数を足して出力
        }else{
             System.out.println(blue*(n+1));
        } 
	}
}