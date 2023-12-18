import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wordsN = scanner.nextInt();
        String[] shiritoriW = new String[wordsN];
        String ans="Yes";
        shiritoriW[0] = scanner.next();

        for(int i=1;i<wordsN;i++){
            shiritoriW[i] = scanner.next();
//            System.out.println(shiritoriW[i].charAt(0)+","+shiritoriW[i-1].charAt(shiritoriW[i-1].length()-1));
            //直前の単語の最後と今の単語の最初が違う文字なら
            if(!(shiritoriW[i].charAt(0)==shiritoriW[i-1].charAt(shiritoriW[i-1].length()-1))){
                ans="No";
            } else {
                for(int j=i-1;j>0;j--){
                    if(shiritoriW[i].equals(shiritoriW[j])){
                        ans = "No";
                    }
                }
            }
        }
//        //debug
//        for(int i=1;i<wordsN;i++) {
//            System.out.println(shiritoriW[i]);
//        }
        System.out.println(ans);
    }
}
