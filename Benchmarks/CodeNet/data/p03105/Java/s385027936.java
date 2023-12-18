import java.io.*;

class Favoritesound{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] ABC = str.split(" ");
        int ans = Integer.parseInt(ABC[1])/Integer.parseInt(ABC[0]);
        if (ans > Integer.parseInt(ABC[2])){
            ans = Integer.parseInt(ABC[2]);
        }
        System.out.println(ans);
    }
}