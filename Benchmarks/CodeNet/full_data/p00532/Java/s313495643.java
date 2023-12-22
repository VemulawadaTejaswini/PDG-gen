import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int game=0,i=0,person=0;
		int[] target=null;
		boolean first=true;
		int[] score = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	if(first){
            		person=Integer.parseInt(line);
            		game=Integer.parseInt(br.readLine());
                	String[] str=br.readLine().split(" ");
                	target=new int[str.length];
                	for(int k=0;k<str.length;k++){
                		target[k]=Integer.parseInt(str[k]);
                	}
                	score=new int[person+1];
                	first=false;
            	}else{
            		String[] str=line.split(" ");
            		int hazure=0;
            		for(int k=1;k<score.length;k++){
            			if(Integer.parseInt(str[k-1])==target[i]){
            				score[k]++;
            			}else{
            				hazure++;
            			}
            		}
            			score[target[i]]+=hazure;

            		i++;
            		if(i==game){
            			for(int k=1;k<score.length;k++){
            				System.out.println(score[k]);
            			}
            			break;
            		}
            	}
            }
		}
	}

}