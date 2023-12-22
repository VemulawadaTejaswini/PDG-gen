import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextInt(); sc.nextLine();
       long total=1;
      
long[] intArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToLong(Long::parseLong) //数値にして
    .toArray(); //配列へ
for(int i=0;i<intArray.length;i++){
total*=intArray[i];
}
//計算
      if(total>Math.pow(10, 18)){
System.out.println("-1");
      }else{

      
		// 出力
		System.out.println(total);}
	}
}