import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scaner scan = new Scanner(System.in);

    int input1 = scan.nextInt();

    Tree main = new Tree(-2147483648);

    for(int loopCount = 0; loopCount < input1; loopCount++) {
      char[] s = scan.next().toCharArray();
      if(s[0]=='i') main.insert(scan.nextInt());
      else if(s[0]=='p') {
        if(main.right != null) {
          main.right.printMiddle();
          System.out.println();
          main.right.printFirst();
          System.out.println();
        }
      }
    }
  }
}

class Tree{
  int key;
  Tree left,right;

  Tree(int _key) {
    this.key = _key;
  }

  void insert(int _num) {
    if(key<_num) {
      if(right == null) {
        right = new Tree(_num);
      }else {
        right.insert(_num);
      }
    }else if(key>_num) {
      if(left == null) {
        left = new Tree(_num);
      }else {
        left.insert(_num);
      }
    }
  }

  String find(int _num) {
    if(key == _num) return "YES";
    else {
      if(key > _num) return left.find(_num);
      if(key < _num) return right.find(_num);
      return "NO";
    }
  }

  void printFirst() {
    System.out.print(" "+key);
    if(left!=null) left.printFirst();
    if(right!=null) right.printFirst();
  }

  void printMiddle() {
    if(left!=null) left.printMiddle();
    System.out.print(" "+key);
    if(right!=null) right.printMiddle();
  }
}