import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] word = new String[n];
        boolean jdg = true;
        for(int i = 0;i < n;i++)
            word[i] = sc.next();

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(word[i].equalsIgnoreCase(word[j])){
                    jdg = false;
                    break;
                }
            }
            if(jdg == false)
            break;
        }

        if(jdg == true){
            for(int i = 0;i < n-1;i++){
                if(word[i].charAt(word[i].length()-1) != word[i+1].charAt(0)){
                    jdg = false;
                    break;
                }
            }
        }
        System.out.println(jdg == true?"Yes" : "No");
        
    }
}