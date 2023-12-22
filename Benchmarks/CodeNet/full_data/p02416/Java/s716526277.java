import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        //入力
        while(true){
            String inputNum = sc.next();
            if(inputNum.equals("0")) break;
            list.add(inputNum);
        }
        
        Calculation calc = new Calculation();
        for(int i = 0; i < list.size(); i++){
            System.out.println(calc.changeIntCalc(list.get(i)));
        }
    }
}

class Calculation{
    public int changeIntCalc(String listNum){
        int charCut = 0;
        String[] strArray = listNum.split("");
        for(int count = 0; count < listNum.length(); count++){
            charCut += Integer.parseInt(strArray[count]);
        }
        return charCut;
    }
}
