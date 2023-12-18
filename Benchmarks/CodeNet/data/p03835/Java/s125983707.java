import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int S = in.nextInt();
		int count=0;
		for(int x=0;x<=K;x++){
			if(x==S){count++;continue;}
			for(int y=0;y<=K;y++){
				if(S-x>2*K)break;
				if(x+y==S){count++;continue;}
				for(int z=0;z<=K;z++){
					if(S-x-y>K)break;
					if(x+y+z==S){count++;continue;}
				}
			}
		}
		System.out.println(count);
		in.close();
		
	}
}
