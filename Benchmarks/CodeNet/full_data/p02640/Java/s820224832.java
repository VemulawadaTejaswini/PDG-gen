import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); //動物の数
		int Y = sc.nextInt(); //足の総数
		int num = 0;
		//鶴の数をiとすれば、亀の数はx-iだけ存在する
		
		for ( int i = 0; i <= X; i++) {
			if (Y == i*2 + (X - i)*4) {
			//	System.out.println("鶴:"+i + " ,亀:"+ (X-i));
				break;
			}
			else
				num++;
		}
		
		if ( num == (X+1))
			System.out.println("No");
		else
			System.out.println("Yes");
  }
}