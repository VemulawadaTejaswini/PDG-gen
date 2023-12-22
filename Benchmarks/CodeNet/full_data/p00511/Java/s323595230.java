import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        String exp = "(" + sc.next() + sc.next() + sc.next() + ")";
        while(true){
            String op = sc.next();
            if(op.equals("=")){
                break;
            }
            exp = "(" + exp + op + sc.next() + ")";
        }
        Parser parser = new Parser(exp);
        System.out.println(parser.expression());
    }
    public static void main(String[] args){
        new Main().run();
    }
}

class Parser{
    char[] exp;
    int begin;
    Parser(String str){
        this.exp = (str+"#").toCharArray();
    }
    //四則演算の式をパースして、その評価結果を返す
    int expression(){
        int ret = term();
        
        while(true){
            if(exp[begin] == '+'){
                begin++;
                ret += term();
            }
            else if(exp[begin] == '-'){
                begin++;
                ret -= term();
            }
            else{
                break;
            }
        }
        return ret;
    }
    //乗算除算の式をパースして、その評価結果を返す
    int term(){
        int ret = factor();
        while(true){
            if(exp[begin] == '*'){
                begin++;
                ret *= factor();
            }
            else if(exp[begin] == '/'){
                begin++;
                ret /= factor();
            }
            else{
                break;
            }
        }
        return ret;
    }
    //数字の列をパースして、その数を返す
    int number(){
        int ret = 0;
        while(Character.isDigit(exp[begin])){
            ret *= 10;
            ret += exp[begin] - '0';
            begin++;
        }
        return ret;
    }
    //括弧か数かをパースして、その評価結果を返す
    int factor(){
        if(exp[begin] == '('){
            begin++;//'('を飛ばす
            int ret = expression();
            begin++;//')'を飛ばす
            return ret;
        }
        else{
            return number();
        }
    }
}
//https://gist.github.com/draftcode/1357281