public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String s = scan.next();   
        final String t = scan.next();
        String resultStr = s;
        boolean isFind = true;
        String tempT;
        int count = 1;
        int[] findIndex = new int[t.length()];
        String[] findString = new String[t.length()];

        // tを構成する全英文字がsに含まれているか
        for(int i = 0; i < t.length(); i++){
            tempT = t.substring(i, i + 1);
            if(s.contains(tempT)){
                findIndex[i] = s.indexOf(tempT);
                findString = tempT;
            }else{
                isFind = false;
                break;
            }
        }
        if(isFind){
            for(int i = 1; i < t.length(); i++){
                if(findIndex[i - 1] > findIndex[i] && s.indexOf(findString[i], findIndex[i - 1] + 1) == -1 ){
                    resultStr = resultStr + s;
                    count++;
                }
            }
            resultStr = resultStr.substring(0, (count - 1) * s.length() + findIndex[t.length() - 1] + 1);
            System.out.println(resultStr.length());


        }else{
            System.out.println("-1");
        }
        scan.close();
    }
}