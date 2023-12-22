import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,n=0,m=0;
        String[] flag=null;
        int[] tarou=null,hanako=null;
        boolean[] tat=null;
        boolean first=true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		if(n==0)break;
            		tarou=new int[n];
            		hanako=new int[n];
            		tat=new boolean[2*n+1];
            		i=0;
            		first=false;
            	}else{
            		tarou[i]=Integer.parseInt(line);
            		tat[Integer.parseInt(line)]=true;
            		i++;
            		if(i==n){
            			int l=0;
            			for(int j=1;j<2*n+1;j++){
            				if(!tat[j]){
            					hanako[l]=j;
            					l++;
            				}
            			}
            			for(int j=0;j<n;j++){
            				int store=j;
            				int min=tarou[j];
            				for(int k=j+1;k<n;k++){
            					if(min>tarou[k]){
            						min=tarou[k];
            						store=k;
            					}
            				}
            				int w=tarou[j];
            				tarou[j]=tarou[store];
            				tarou[store]=w;
            			}
            			int t=n,h=n;
            			boolean hajime=false,pass=true,tar=true,last=true;;
            			int ta=0,ha=0;
            			int ba=0;
            			int store1=0,store2=0;
            			int[] st={-1,-1};
            			while(true){
        					if(st[0]==t&&st[1]==h){
        					}else{
        						st[0]=t;
        						st[1]=h;
        					}
            				if(t==0||h==0){
            					break;
            				}
            				if(tar){
	            				for(int k=ta;k<n;k++){
	            					if(ba<tarou[k]){
	            						//System.out.println(tarou[k]);
	            						ba=tarou[k];
	            						ta=k+1;
	            						tarou[k]=-1;
	            						t--;
	            						last=true;
	            						store1=k;
	            						pass=false;
	            						break;
	            					}
	            					store1=k;
	            				}
	            				tar=false;
            				}
            				if(pass){
            					ba=0;
            					ta=0;
            					ha=0;
            				}
            				pass=true;
            				if(t==0||h==0){
            					break;
            				}
            				if(!tar){
	            				for(int k=ha;k<n;k++){
	            					if(ba<hanako[k]){
	            						//System.out.println(hanako[k]);
	            						ba=hanako[k];
	            						ha=k+1;
	            						hanako[k]=-1;
	            						h--;
	            						last=false;
	            						store2=k;
	            						pass=false;
	            						break;
	            					}
	            					store2=k;
	            				}
	            				tar=true;
            				}
            				if(pass){
            					ba=0;
            					ta=0;
            					ha=0;
            				}
            				pass=true;
            				if(store1==store2&&store1==(n-1)){
            					ba=0;
            					ta=0;
            					ha=0;
            					tar=last?true:false;
            				}
            			}
            			System.out.println(Integer.max(t,h));
            			System.out.println(Integer.min(t,h));
            			first=true;
            		}

            	}
            }
         }
	}

}