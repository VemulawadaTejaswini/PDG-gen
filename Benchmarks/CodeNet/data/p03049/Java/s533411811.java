import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int abCount = 0;
        int topBandendA = 0;//先頭がBで最後がA
        int topB = 0;//先頭がB
        int endA = 0;//最後がA
        String[] s = new String[N];
        //入力処理
        //入力ごとに文字列中のABの数を数える
        for(int i = 0;i < N ;i++){
            s[i] = sc.next();
            abCount += abCount(s[i]);
            if(s[i].startsWith("B") && endWith(s[i],'A')){
                topBandendA++;
            }else if(s[i].startsWith("B")){
                topB++;
            }else if(endWith(s[i],'A')){
                endA++;
            }
        }

        if(endA >= 1 && topB >= 1 || endA >=1 && topBandendA >= 1) {
            if (endA >= 1) {
                endA--;
            } else if (endA == 0 && topBandendA >= 1) {
                topBandendA--;
            }
            while (topBandendA >= 1) {
                topBandendA--;
                abCount++;
                if (topBandendA == 0 && topB >= 1) {
                    topB--;
                    abCount++;
                }
            }
        }

        while(topB > 0 && endA > 0){
            topB --;
            endA --;
            abCount ++;
        }

        System.out.println(abCount);
    }
    private static int abCount(String s){
        int abNum = 0;
        int from =-1;
        Boolean frag = true;
        while(frag) {
            from = s.indexOf("AB", from);
            if(from != -1){
                from++;
                abNum++;
            }else{
                frag = false;
            }
        }
        return abNum;
    }

    private static Boolean endWith(String s,char endChar){
        Boolean frag;
        char check = s.charAt(s.length()-1);
        if(endChar == check){
            frag = true;
        }else{
            frag = false;
        }
        return frag;
    }
}