import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        char str[]=in.next().toCharArray();

        List<Integer> D=new ArrayList<>(),M=new ArrayList<>(),C=new ArrayList<>();

        for(int i=0;i<str.length;i++){
            switch(str[i]){
                case 'D':
                D.add(i);
                break;

                case 'M':
                M.add(i);
                break;

                case 'C':
                C.add(i);
                break;
            }
        }

        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int k=in.nextInt();
            int cnt=0;

            int dp=0;
            for(int d=0;d<D.size();d++){
                dp=D.get(d);
                for(int m=0;m<M.size();m++){
                    if(M.get(m)>D.get(d)){
                        for(int c=0;c<C.size();c++){
                            if(C.get(c)>M.get(m) && C.get(c)-D.get(d)<k)cnt++;
                        }
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}