import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B {
    public static void main(String[] args) throws Exception {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n = Integer.parseInt(br.readLine());
    
        String s[] = new String[n];
        Integer p[] = new Integer[n];
        Integer suffix[] = new Integer[n];

        for(int i=0;i<suffix.length;i++)
            suffix[i] = i;

        for(int i=0;i<n;i++){
            String str = new String(br.readLine());
            s[i] = str.split("\\s+")[0];
            p[i] = Integer.parseInt(str.split("\\s+")[1]);
        }
      
        for(int j=0;j<s.length;j++){
            for(int k=s.length-1;k>j;k--){
                if(s[j].compareTo(s[k]) > 0){
                    String str = s[j];
                    s[j] = s[k];
                    s[k] = str;

                    int c = p[j];
                    p[j] = p[k];
                    p[k] = c;

                    int st = suffix[j];
                    suffix[j] = suffix[k];
                    suffix[k] = st;
                }
            }
        }



        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++){
            
            for(int j=i;j<s.length;j++){
                if(s[i].equals(s[j])) l.add(p[j]);                
            }

            for(int k=0;k<l.size();k++){
                for(int m=l.size()-1;m<k;m--){
                    if(l.get(k)>l.get(m)){
                        int tp = l.get(k);
                        l.set(k,l.get(m));
                        l.set(m,tp);

                        int st = suffix[k];
                        suffix[k] = suffix[m];
                        suffix[m] = st;
                    }
                }
            }

        }

        for(int i=0;i<s.length;i++)
            System.out.println(s[i] + "   " + p[i] + "   " + suffix[i]);

    }
}