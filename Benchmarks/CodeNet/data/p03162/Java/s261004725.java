import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author German le yo
 */
public class Main{
    
    static int getFather(int[] ds, int i){
        if(ds[i] == i) return i;
        return ds[i] = getFather(ds, ds[i]);
    }
    
    static void setFather(int[] ds, int i, int father){
        ds[getFather(ds, i)] = getFather(ds, father);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        
        scan.nextLine();
        scan.nextLine();
        
        LinkedList<String> listInput = new LinkedList();
        String tmp;
        String[] input;
        int[] ds, setSizes;
        int strSize, maxDsSize;
        while(cases-- > 0){
            // Initialize
            listInput.clear();
            strSize = -1;
            maxDsSize = 0;
            // Read Input
            while(true){
                tmp = scan.nextLine().trim();
                if(tmp.length() == 0) break;
                if (strSize == -1) strSize = tmp.length();
                
                listInput.add(tmp);
            } 
            
            input = listInput.toArray(new String[listInput.size()]);
            
            // Create DisjointSet
            ds = new int[strSize * input.length];
            for(int i = 0; i < ds.length; i++) ds[i] = i;
            
            for(int i = 0; i < input.length; i++){
                // If current character is different from 0
                for(int j = 0; j < input[i].length(); j++) if(input[i].charAt(j) != '0'){
                    // Verify if top character is different from 0
                    if(i != 0 && input[i - 1].charAt(j) != '0'){
                        // If it is, add to the disjointSet
                        setFather(ds, (input[i].length()* i) + j , (input[i].length() * (i - 1)) + j);
                    }
                    
                    // verify if left character is different from 0
                    if(j != 0 && input[i].charAt(j - 1) != '0'){
                        // If it is add to the disjoint set
                        setFather(ds, input[i].length() * i + j , input[i].length() * i + (j - 1));
                    }
                }
            }
            
            setSizes = new int[ds.length];
            
            // Count the number of elements in each disjoint set
            for(int i = 0; i < ds.length; i++) setSizes[getFather(ds, i)]++;
            
            // Get max size of disjointsets
            for(int i = 0; i < setSizes.length; i++) if(setSizes[i] > maxDsSize) maxDsSize = setSizes[i];
            
            System.out.println(maxDsSize);
            if(cases != 0) System.out.println();
        }
        
    }
}
