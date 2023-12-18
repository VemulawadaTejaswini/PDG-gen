import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] count = new int[str.length()];
        char[] charArray = str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                str.indexOf(charArray[i],j);
                count[i]++;
            }
        }
        int temp = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]%2!=0){
                System.out.println("No");
                break;
            }else{
                temp++;
            }
        }
        if(temp==count.length)System.out.println("Yes");
    }
}