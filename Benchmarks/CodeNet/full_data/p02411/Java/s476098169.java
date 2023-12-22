import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[3];
		int in[] = new int[3];
		while(true){
			str = br.readLine().split(" ");
			in = parseInts(str);
			if(in[0]==-1 && in[1]==-1 && in[2]==-1) break;
			if(in[0]==-1 || in[1]==-1){
				System.out.println("F");
			}else if(in[0]+in[1]>=80){
				System.out.println("A");
			}else if(in[0]+in[1]>=65){
				System.out.println("B");
			}else if(in[0]+in[1]>=50){
				System.out.println("C");
			}else if(in[0]+in[1]>=30){
				if(in[2]>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}
		}
	}
	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}