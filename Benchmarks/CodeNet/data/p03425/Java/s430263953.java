import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<String>M=new ArrayList<String>();
        ArrayList<String>A=new ArrayList<String>();
        ArrayList<String>R=new ArrayList<String>();
        ArrayList<String>C=new ArrayList<String>();
        ArrayList<String>H=new ArrayList<String>();
        String[]namae=new String[N];
        for(int i=0;i<N;i++){
            namae[i]=sc.next();
            char[]a=namae[i].toCharArray();
            if(a[0]=='M'){
                M.add(namae[i]);
            }
            if(a[0]=='A'){
                A.add(namae[i]);
            }
            if(a[0]=='R'){
                R.add(namae[i]);
            }
            if(a[0]=='C'){
                C.add(namae[i]);
            }
            if(a[0]=='H'){
                H.add(namae[i]);
            }
        }
        int sum=0;
        sum+=M.size()*A.size()*R.size();
        sum+=M.size()*A.size()*C.size();
        sum+=M.size()*A.size()*H.size();
        sum+=M.size()*R.size()*C.size();
        sum+=M.size()*R.size()*H.size();
        sum+=M.size()*C.size()*H.size();
        sum+=A.size()*R.size()*C.size();
        sum+=A.size()*R.size()*H.size();
        sum+=A.size()*C.size()*H.size();
        sum+=R.size()*C.size()*H.size();
        System.out.println(sum);
        
        
        /*
        if(M.size()==0){
            M.add("huhuhu");
        }
        if(A.size()==0){
            A.add("huhuhu");
        }
        if(R.size()==0){
            R.add("huhuhu");
        }
        if(C.size()==0){
            C.add("huhuhu");
        }
        if(H.size()==0){
            H.add("huhuhu");
        }*/

        }
       
        
    }