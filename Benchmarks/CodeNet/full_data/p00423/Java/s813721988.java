import java.util.Scanner;

public class Main {

	static int output[] = new int[10000];
	
	public static void main(String[] args) {
		int key=0, num, a, b;
		Scanner scan = new Scanner(System.in);
		
		//int in;
		while(true){
			num = scan.nextInt();
			if(num==0)break;
			
			for(int i=0;i<num;i++){
				a = Integer.parseInt(scan.next());
				b = Integer.parseInt(scan.next());
				if(a>b)
					output[key]+=(a+b);
				else if(a<b)
					output[key+1]+=(a+b);
				else{
					output[key] += a;
					output[key+1] += b;
				}
			}
			key+=2;
		}
		
		for(int i=0;i<key;i+=2)
			System.out.println(output[i]+" "+output[i+1]);
	}

}