import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
// insert ???????????????Binary Tree
// ?????????parentind = -1??¨????????????
class Treenode{
  int key;
  int leftind;
  int rightind;
  int oyaind;
  boolean havevalue;
  boolean haveleft;
  boolean haveright;

  Treenode(){
    haveleft = false;
    haveright = false;
    havevalue = false;
  }
}

public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int comnum = sc.nextInt();
    Treenode[] tree = new Treenode[comnum];
    for(int i = 0; i < comnum; i++){
      tree[i] = new Treenode();
    }

// ?????£???????????????print??§???????????¨???????????????????????°??????
    int insertcount = 0;
    for(int comind = 0; comind < comnum; comind++){
      String comstr = sc.nextStr();
      if(comstr.charAt(0) == 'i'){// insert
        int insertvalue = sc.nextInt();
        int nownodeind = 0;
        int parentind = -1;
        while(tree[nownodeind].havevalue){
          Treenode nowtreenode = tree[nownodeind];
          if(nowtreenode.key < insertvalue){
            if(nowtreenode.haveright){
              parentind = nownodeind;
              nownodeind = nowtreenode.rightind;
            }else{
              parentind = nownodeind;
              nowtreenode.haveright = true;
              nowtreenode.rightind = insertcount;
              nownodeind = insertcount;
            }
          }else{
              parentind = nownodeind;
            if(nowtreenode.haveleft){
              nownodeind = nowtreenode.leftind;
            }else{
              parentind = nownodeind;
              nowtreenode.haveleft = true;
              nowtreenode.leftind = insertcount;
              nownodeind = insertcount;
            }
          }
        }

        tree[nownodeind].oyaind = parentind;
        tree[nownodeind].havevalue = true;
        tree[nownodeind].key = insertvalue;
        insertcount++;
      }else{// print
        //????????????????????????
        boolean[] acheck = new boolean[insertcount];
        for(int i = 0; i < insertcount; i++){
          acheck[i] = false;
        }
        int nownodeind = 0;
        int nowprinted = 0;
        while(nowprinted < insertcount){
          Treenode nowtreenode = tree[nownodeind];
          if(nowtreenode.haveleft && nowtreenode.haveright){//????????????????????´???
            if(acheck[nownodeind]){//????????????????????????????????´???
              if(acheck[nowtreenode.rightind]){//????????????????????????=?????????????????\???????????????
                nownodeind = nowtreenode.oyaind;
              }else{
                nownodeind = nowtreenode.rightind;
              }
            }else{//???????????????????????´???
              if(acheck[nowtreenode.leftind]){//?????????????????????????????´???
                System.out.printf(" %d", nowtreenode.key);
                acheck[nownodeind] = true;
                nowprinted++;
                nownodeind = nowtreenode.rightind;
              }else{
                nownodeind = nowtreenode.leftind;
              }
            }
          }else if(nowtreenode.haveleft){//??????????????????????????´???
            if(acheck[nowtreenode.leftind]){
              System.out.printf(" %d", nowtreenode.key);
              acheck[nownodeind] = true;
              nowprinted++;
              nownodeind = nowtreenode.oyaind;
            }else{
              nownodeind = nowtreenode.leftind;
            }
          }else if(nowtreenode.haveright){//??????????????????????????´???
            if(acheck[nownodeind]){
              if(acheck[nowtreenode.rightind]){
                nownodeind = nowtreenode.oyaind;
              }else{
                nownodeind = nowtreenode.rightind;
              }
            }else{
              System.out.printf(" %d", nowtreenode.key);
              acheck[nownodeind] = true;
              nowprinted++;
              nownodeind = nowtreenode.rightind;
            }
          }else{//??????????????´???(=????????´???)
            System.out.printf(" %d", nowtreenode.key);
            acheck[nownodeind] = true;
            nowprinted++;
            nownodeind = nowtreenode.oyaind;
          }
        }

        System.out.println("");

        
        //?¬??????????????????????
        boolean[] bcheck = new boolean[insertcount];
        for(int i = 0; i < insertcount; i++){
          bcheck[i] = false;
        }
        nownodeind = 0;
        nowprinted = 0;

        while(nowprinted < insertcount){
          Treenode nowtreenode = tree[nownodeind];
          if(nowtreenode.haveleft && nowtreenode.haveright){//????????????????????´???
            if(bcheck[nownodeind]){//??????????????????????????´???
              if(bcheck[nowtreenode.rightind]){//???????????????????????????
                nownodeind = nowtreenode.oyaind;
              }else{
                nownodeind = nowtreenode.rightind;
              }
            }else{//??????????????????
              System.out.printf(" %d", nowtreenode.key);
              nowprinted++;
              bcheck[nownodeind] = true;
              nownodeind = nowtreenode.leftind;
            }
          }else if(nowtreenode.haveleft){//??????????????????????????´???
            if(bcheck[nownodeind]){
              nownodeind = nowtreenode.oyaind;
            }else{
              System.out.printf(" %d", nowtreenode.key);
              nowprinted++;
              bcheck[nownodeind] = true;
              nownodeind = nowtreenode.leftind;              
            }
          }else if(nowtreenode.haveright){//??????????????????????????´???
            if(bcheck[nownodeind]){
              nownodeind = nowtreenode.oyaind;
            }else{
              System.out.printf(" %d", nowtreenode.key);
              nowprinted++;
              bcheck[nownodeind] = true;
              nownodeind = nowtreenode.rightind;                            
            }
          }else{//??????????????´???(=????????´???)
            System.out.printf(" %d", nowtreenode.key);
            nowprinted++;
            bcheck[nownodeind] = true;
            nownodeind = nowtreenode.oyaind;
          }
        }

        System.out.println("");
      }
    }

  }
 
//nextChar ?????????????????????

//System.out.printf("? %d %d\n", i, j);

  
// LinkedList<Integer>[] setsu = new LinkedList[n];
// for(int i = 0; i < n; i++){
//   setsu[i] = new LinkedList<Integer>();
// } 

 //???????????????????????¬
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;

      public InputReader(InputStream stream) {
          this.stream = stream;
      }
 
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
 
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }

      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }

      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }
 
      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
 
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}