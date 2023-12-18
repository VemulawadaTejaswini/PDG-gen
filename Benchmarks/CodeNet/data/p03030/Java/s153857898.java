import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws Exception {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        int n = Integer.parseInt(br.readLine());
    
        ArrayList<String> list = new ArrayList<String>();
        Integer p[] = new Integer[n];
        for(int i=0;i<n;i++){
            String str = new String(br.readLine());
            list.add(str.split("\\s+")[0]);
            p[i] = Integer.parseInt(str.split("\\s+")[1]);
        }

        Collections.sort(list);

        int j=0;
        while(!(list == null || list.size() == 0)){
            String str = list.get(j);
            int counter = list.indexOf(str);
            for(int k=0;k<counter;k++) list.remove(k);

            for(int l=0;l<p.length;l++){
                if(p[l] )
            }

            j=k+1;
        }
    }
}