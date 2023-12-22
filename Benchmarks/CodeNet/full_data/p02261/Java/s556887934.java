import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,minN,q=0;
        String tmpstr="";
        n=scan.nextInt();
        String[] sortN=new String[n];
        String[] sort0=new String[n];
        String[] sort1=new String[n];
        int[] stablechecker=new int[n];
        int checker=1;
        
        for(int i=0; i<n; i++){
            sort0[i]=sort1[i]=sortN[i]=scan.next();
        }
        
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n; j++)
                if(sortN[i].charAt(1)==sortN[j].charAt(1)){
                    stablechecker[i]=stablechecker[j]=checker;
                    checker++;
                }
                        
        //System.out.println(Arrays.toString(sort0)+Arrays.toString(sort1));
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(sort0[j].charAt(1)-'0'>sort0[j+1].charAt(1)-'0'){
                    tmpstr=sort0[j];
                    sort0[j]=sort0[j+1];
                    sort0[j+1]=tmpstr;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(sort0[i]);
            if(i!=n-1)
                System.out.print(" ");
            else
                System.out.println();
        }
        System.out.println("Stable");
    	
        for(int i=0; i<n; i++){
            minN=i;
            for(int j=i+1; j<n; j++){
                if(sort1[minN].charAt(1)-'0'>sort1[j].charAt(1)-'0'){
                    minN=j;
                }
            }
            if(minN!=i){
                tmpstr=sort1[minN];
                sort1[minN]=sort1[i];
                sort1[i]=tmpstr;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(sort1[i]);
            if(i!=n-1)
                System.out.print(" ");
            else
                System.out.println();
        }
        if(Arrays.toString(sort0).equals(Arrays.toString(sort1)))
            System.out.println("Stable");
        else
            System.out.println("Not stable");
        
        //System.out.println(Arrays.toString(sort0)+Arrays.toString(sort1));
    }
}
