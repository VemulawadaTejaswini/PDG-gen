import java.util.ArrayList;
import java.util.Scanner;

public class no2 {
	static Scanner stdIn= new Scanner(System.in);
//	static ArrayList<Integer> smPrime = new ArrayList<Integer>();

	public static void main(String args[]){
		while(true){
			int input = stdIn.nextInt();
			if(input==1)
				break;
			func(input);
		}
	}
	static public void func(int in){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(isPrime(in)){
			ans.add(in);
		}
		else{
			int idxh=0,idxb=0;
			int tmp=6;
			while(tmp*tmp<=in){
				if(in % tmp == 0){
					if(isPrime(tmp)){
						ans.add(idxh++,tmp);
						System.out.println(tmp);
					}
					if(isPrime(in/tmp)){
						ans.add(ans.size()-(idxb++),in/tmp);
						System.out.println(in/tmp);
					}
				}
				tmp+=2;
				if(in % tmp == 0 && tmp*tmp<=in){
					if(isPrime(tmp)){
						ans.add(idxh++,tmp);
						System.out.println(tmp);
					}
					if(isPrime(in/tmp)){
						ans.add(ans.size()-(idxb++),in/tmp);
						System.out.println(in/tmp);
					}	
				}
				tmp+=5;
			}
		}
		System.out.print(in+":");
		for(int i=0;i<ans.size();i++){
			System.out.print(" "+ans.get(i));
		}
		System.out.println();
	}
	private static boolean isPrime(int i) {
		int tmp=6;
		while(tmp*tmp<=i){
			if(i % tmp == 0 )
			{
				return false;
				}
			tmp+=2;
			if(i % tmp == 0 )
			{
				return false;
				}

			tmp+=5;
		}
		return true;
	}
}