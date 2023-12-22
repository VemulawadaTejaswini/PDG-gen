import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {
    public static void main(String[] args) throws Exception {
        // ??\???????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] sarray = br.readLine().split(" ",length);
        // ???????????????????????????  
        bubbleSort(sarray , length);
          
    }
    
    public static void bubbleSort(String[] sarray , int length) {
        String str;
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int cnt = 0;
        int k = 0;
        
        while ( flag == true ){
            flag = false;
            // ????????????????????????
            for ( int j = length - 1 ; j > k ; j--){
                if( Integer.parseInt(sarray[j]) < Integer.parseInt(sarray[j - 1]) ) {
                    str = sarray[j];
                    sarray[j] = sarray[j - 1];
                    sarray[j - 1] = str;
                    
                    cnt = cnt + 1;
                    flag = true;
                }
            }
            k = k++;
        }
        for ( int i = 0 ; i < length ; i++){
            if ( i > 0 ){
                sb = sb.append(" ");
            }
            sb = sb.append(sarray[i]);
        }
        System.out.println(sb);
        System.out.println(cnt);
    }
};
