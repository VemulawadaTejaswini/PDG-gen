import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while(n>0) {
      ArrayList<String> input_arr = new ArrayList<>();
      for(int i = 0; i < n; i++) input_arr.add(scan.next());

      int[][] arr = new int[input_arr.size()][2];
      for(int i = 0; i < input_arr.size(); i++) {
        char[] _in = input_arr.get(i).toCharArray();
        int count = 0;
        int cursor = 0;
        while(_in[cursor]=='.') {
          count++;
          cursor++;
        }

        int num = 0;
        if(_in[cursor]=='+') num=-1;
        else if(_in[cursor]=='*') num=-2;
        else num=(int)(_in[cursor]-'0');
        arr[i][0] = count;
        arr[i][1] = num;
      }

      AbstractExpression ae;
      if(AbstractExpression.isTerminal(arr,0)) {
        ae = new TerminalExpression();
      }else {
        ae = new NonterminalExpression();
      }
      ae.interpret(arr,0);
      System.out.println(ae.calc());

      n = scan.nextInt();
    }
  }
}

abstract class AbstractExpression{
  AbstractExpression() {

  }
  abstract int interpret(int[][] _arr,int num);
  abstract int calc();
  static boolean isTerminal(int[][] _arr,int num) {
    return _arr[num][1]>=0;
  }
}

class TerminalExpression extends AbstractExpression{
  int term;
  TerminalExpression() {

  }
  @Override
  int interpret(int[][] _arr,int num) {
    term = _arr[num][1];
    return 1;
  }
  @Override
  int calc() {
    return term;
  }
}

class NonterminalExpression extends AbstractExpression{
  ArrayList<AbstractExpression> aeArray;
  int mark = 0;
  NonterminalExpression() {
    aeArray = new ArrayList<>();
  }
  @Override
  int interpret(int[][] _arr,int num) {
    int startDepth = _arr[num][0];
    mark = _arr[num][1];
    int startNum = num;
    num++;
    while(num<_arr.length && _arr[num][0]>startDepth) {
      AbstractExpression _ae = null;
      if(isTerminal(_arr,num)) {
        _ae = new TerminalExpression();
      }else {
        _ae = new NonterminalExpression();
      }
      aeArray.add(_ae);
      num += _ae.interpret(_arr,num);
    }
    return num-startNum;
  }
  @Override
  int calc() {
    int result = 0;
    if(mark==-1) {
      for(AbstractExpression _ae : aeArray) result += _ae.calc();
    }else if(mark==-2) {
      result = 1;
      for(AbstractExpression _ae : aeArray) result *= _ae.calc();
    }
    return result;
  }
}