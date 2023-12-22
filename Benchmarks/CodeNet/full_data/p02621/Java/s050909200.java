import java.io.*;
 
class main{
  public static void calc(String args[]){
  	try{
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String str = br.readLine();
      	int a = Integer.parseInt(str);
      	if((a>=1 && a<=10)){
      	int b = a*a;
      	int c = b*a;
      	int sum = a+b+c;
      	System.out.println(sum);
        }else{
        System.out.println("入力された値が不正です");
        }
  	}catch(IOException e){
  		System.out.println("入出力エラーです");
  	}
  }
}