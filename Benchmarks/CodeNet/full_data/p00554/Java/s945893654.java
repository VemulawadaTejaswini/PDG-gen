import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,mono=0,point=0;
        int[] atari=null;
        boolean first=true;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(first){
            		point=Integer.parseInt(str[0]);
            		mono=Integer.parseInt(str[1]);
            		atari=new int[mono];
            		first=false;
            	}else{
            		atari[i]=Integer.parseInt(str[0]);
            		i++;
            		if(mono==i){
            			break;
            		}
            	}
            }
            for(int j=0;j<atari.length;j++){
            	int store=j;
            	int max=atari[j];
            	for(int k=j+1;k<atari.length;k++){
            		if(atari[k]>max){
            			max=atari[k];
            			store=k;
            		}
                }
            	int w=atari[j];
            	atari[j]=atari[store];
            	atari[store]=w;
            }
            for(int j=0;j<atari.length-1;j++){
            	if(atari[j]<point){
            		sum+=(point-atari[j]);
            	}
            }
            System.out.println(sum);
        }
	}

}