import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quality_Checking {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,num=0;
        int[] motor=null,cav=null,io=null,all=null;
        int[][] result=null;
        boolean first=true;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		String[] str=line.split(" ");
            		if(str[0].equals(str[1])&&str[2].equals(str[1])&&str[0].equals("0"))break;
            		io=new int[Integer.parseInt(str[0])];
            		motor=new int[Integer.parseInt(str[1])];
            		cav=new int[Integer.parseInt(str[2])];
            		all=new int[io.length+motor.length+cav.length+1];
            		for(int k=1;k<all.length;k++){
            			all[k]=2;
            		}
            		num=Integer.parseInt(br.readLine());
            		result=new int[num][4];
            		i=0;
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		for(int k=0;k<4;k++){
            			result[i][k]=Integer.parseInt(str[k]);
            		}
            		i++;
            		if(i==num){
            			for(int k=0;k<result.length;k++){
                			if(result[k][3]==1){
                				for(int j=0;j<3;j++){
                					all[result[k][j]]=1;
                				}
                			}
                		}
            			for(int k=0;k<result.length;k++){
                			if(result[k][3]==0){
                				if(all[result[k][0]]==1&&all[result[k][1]]==1){
                					all[result[k][2]]=0;
                				}else if(all[result[k][2]]==1&&all[result[k][1]]==1){
                					all[result[k][0]]=0;
                				}else if(all[result[k][0]]==1&&all[result[k][2]]==1){
                					all[result[k][1]]=0;
                				}
                			}
                		}
            			for(int k=1;k<all.length;k++){
            				System.out.println(all[k]);
            			}
            			first=true;
            		}
            	}
            }

        }
	}

}