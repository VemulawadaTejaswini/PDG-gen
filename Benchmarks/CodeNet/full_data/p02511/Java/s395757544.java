import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder(100);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		while(true) {
			size = Integer.parseInt(br.readLine());
			if(size == 0) break;
			
			String str = br.readLine();
			
			int prevPos=-1;
			int sPos = str.indexOf(" ");
			
			int startNo = -1;
			int prevNo = -1;
			
			for(int i = 0; i < size; i++) {
				int no;
				if(i == size - 1) {
					no = Integer.parseInt(str.substring(prevPos+1));
					
					if(startNo != -1) {
						sb.append(startNo).append("-").append(no);
					}
					else
						sb.append(no);
				}
				else {
					no = Integer.parseInt(str.substring(prevPos+1, sPos));
					
					if(prevNo+1 == no) {
					}
					else if(startNo != -1) {
						if(startNo == prevNo)
							sb.append(startNo).append(" ");
						else
							sb.append(startNo).append("-").append(prevNo).append(" ");
						
						startNo = no;
					}
					else
						startNo = no;
					
					prevNo = no;
					
					prevPos = sPos;
					sPos = str.indexOf(" ", sPos+1);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}