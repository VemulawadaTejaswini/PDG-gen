import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int cnt=0;
	        int c=0;
            while(n!=6174){
                cnt++;
                String str[]=new String[4];
                int k=1000;
                for(int i=0;i<4;i++){
                    str[i]=String.valueOf(n/k);
                    n=n%k;
                    k/=10;
                }
		        if(str[0].equals(str[1])&&str[0].equals(str[2])&&str[0].equals(str[3])){
		            System.out.println("NA");
		            c++;
		            break;
	       	    }
                Arrays.sort(str,Collections.reverseOrder());
                int L=Integer.parseInt(str[0]+str[1]+str[2]+str[3]);
                int S=Integer.parseInt(str[3]+str[2]+str[1]+str[0]);
                n=L-S;
            }
	        if(c==0){
	    	    System.out.println(cnt);
	        }
        }
    }
}
