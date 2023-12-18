import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)\
);
        String str = br.readLine();
        int fiveCount = search(str,'5');
        int sevenCount = search(str,'7');
        if(fiveCount == 2 && sevenCount == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static int search(String str, char target){
        int count = 0;
        for(char x: str.toCharArray()){
            if(x == target){
                count++;
            }
        }
        return count;
    }
}