import java.io.*;

class Main2{
  public static void main(String[] args)throws java.io.IOException{
	
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	String hoge = input.readLine();
	int i = Integer.parseInt(hoge);

	if(i >=1 && i < 101){
        	System.out.println("Input="+ i);
		System.out.println("Output=" + i*i*i);
	}
	else{
		System.out.println("??°?????????????????§???");
	}
  }
}