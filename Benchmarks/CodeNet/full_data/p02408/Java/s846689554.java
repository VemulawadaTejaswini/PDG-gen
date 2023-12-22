import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[2];
		
		ArrayList<Integer> S=new ArrayList<Integer>();
		ArrayList<Integer> H=new ArrayList<Integer>();
		ArrayList<Integer> C=new ArrayList<Integer>();
		ArrayList<Integer> D=new ArrayList<Integer>();
		
		int n=0;
		try {
			//入力
			n=Integer.parseInt(br.readLine());	//nを入力
			
			for(int i=0; i<n; i++) {
				work=br.readLine().split("\\s+");
				switch(work[0]){
				case "S":
					S.add(Integer.parseInt(work[1]));
					break;
				case "H":
					H.add(Integer.parseInt(work[1]));
					break;
				case "C":
					C.add(Integer.parseInt(work[1]));
					break;
				case "D":
					D.add(Integer.parseInt(work[1]));
					break;
				}
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//ソート
		Collections.sort(S);
		Collections.sort(H);
		Collections.sort(C);
		Collections.sort(D);
		
		//判定
		StringBuilder sb=new StringBuilder();
		
		for(int i=1; i<14; i++) {
			if((S.indexOf(i))==-1){		//indexOfは存在しない値を返すと-1出力.
				sb.append("S "+i);
				sb.append(String.format("%n", ""));
			}
		}
		
		for(int i=1; i<14; i++) {
			if((H.indexOf(i))==-1){		//indexOfは存在しない値を返すと-1出力.
				sb.append("H "+i);
				sb.append(String.format("%n", ""));
			}
		}
		
		for(int i=1; i<14; i++) {
			if((C.indexOf(i))==-1){		//indexOfは存在しない値を返すと-1出力.
				sb.append("C "+i);
				sb.append(String.format("%n", ""));
			}
		}
		
		for(int i=1; i<14; i++) {
			if((D.indexOf(i))==-1){		//indexOfは存在しない値を返すと-1出力.
				sb.append("D "+i);
				sb.append(String.format("%n", ""));
			}
		}
		
		//出力
		System.out.print(sb);
	}

}

