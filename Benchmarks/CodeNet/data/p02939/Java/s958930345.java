import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int count=0;
		int l=0;
		StringBuilder sb = new StringBuilder();
		String prev="";
		for(int i=0;i<st.length();i++){
			sb.append(st.charAt(i));
			if(!sb.toString().equals(prev)){
				count++;
				prev=sb.toString();
				sb = new StringBuilder();
			}
		}
		
		
		System.out.println(count);
		
    }
	
	 private static int computeTemporaryArray(char pattern[]){
        int [] lps = new int[pattern.length];
        int index =0;
		int length=0;
		int y=0;
        for(int i=1; i < pattern.length;){
            if(pattern[i] == pattern[index]){
                lps[i] = index + 1;
                index++;
                i++;
				length++;
				y = Math.max(y,length);
            }else{
                if(index != 0){
                    index = lps[index-1];
                }else{
                    lps[i] =0;
                    i++;
					length=0;
                }
            }
			System.out.println(i+" "+index);
        }
        return y;
    }
	public static class pair{
		long val;
		long bomb;
	}
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return Long.compare(o1.bomb,o2.bomb);
		}
	}
} 