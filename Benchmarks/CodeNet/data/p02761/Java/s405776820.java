public class Main {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        boolean flg = false;
        int[] first = getLineInts();
        int[] keta = new int[first[0]];
        for(int i = 0;i<keta.length;i++){
            keta[i] = -1;
        }
        int[] var;
        for(int i=0;i<first[1];i++){
            var = getLineInts();
            if((keta[var[0]-1] == var[1]) || keta[var[0]-1] == -1){
                keta[var[0]-1] = var[1];
            }else{
                flg = true;
            }

        }
        if(flg){
            System.out.println("-1");
        }else {
            StringBuilder sb = new StringBuilder();
            boolean f = true;
            if(keta[0] == -1){
                keta[0] = 1;
            }
            for(int i = 0; i < keta.length;i++){
                sb.append(keta[i] == -1 ? 0 : keta[i]);
            }

            String finalValue = sb.toString() == "-1" ? "-1" : String.valueOf(new Integer(sb.toString()));
            if(!finalValue.equalsIgnoreCase("-1") && finalValue.length() == keta.length){
                System.out.println(finalValue);
            }else{
                System.out.println(-1);
            }
        }
    }