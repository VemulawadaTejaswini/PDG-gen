import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = parseInts(br.readLine().split(" "));
		long in1[][] = new long[in[0]][in[1]];
		long in2[][] = new long[in[1]][in[2]];
		long in3[][] = new long[in[0]][in[2]];
		for(int i=0; i<in[0]; i++){
			in1[i] = parseLongs(br.readLine().split(" "));
		}
		for(int i=0; i<in[1]; i++){
			in2[i] = parseLongs(br.readLine().split(" "));
		}
		for(int n=0; n<in[0]; n++){
			for(int l=0; l<in[2]; l++){
				for(int m=0; m<in[1]; m++){
					in3[n][l] += in1[n][m] * in2[m][l];
				}
			}
		}
		println(in3);
	}

	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}

	static int sum(int[] x){
		int t = 0;
		for(int a : x){
			t += a;
		}
		return t;
	}

	static void println(long[][] x){
		for(int n=0; n<x.length; n++){
			for(int m=0; m<x[0].length; m++){
				if(m == x[0].length-1){
					System.out.println(x[n][m]);
				}else{
					System.out.print(x[n][m] + " ");
				}
			}
		}
	}
	
	static long[] parseLongs(String[] s){
		long[] x = new long[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Long.parseLong(s[i]);
		}
		return x;
	}
	
}