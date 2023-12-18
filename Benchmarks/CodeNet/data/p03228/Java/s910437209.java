import java.io.*;

class B{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] order=br.readLine().split(" ",0);
		if(order.length!=3){
			System.out.println("入力を確認してください。");
			System.exit(1);
		}
		int A=0,B=0,K=0;
		try{
			A=Integer.parseInt(order[0]);
			B=Integer.parseInt(order[1]);
			K=Integer.parseInt(order[2]);
		}
		catch(NumberFormatException e){
			System.out.println("入力を確認してください。");
			System.exit(1);
		}
		for(int i=0;i<K;i++){
			if (i%2==0){
				A/=2;
				B+=A;
			}
			else{
				B/=2;
				A+=B;
			}
		}
		System.out.println(A+" "+B);
	}
}
