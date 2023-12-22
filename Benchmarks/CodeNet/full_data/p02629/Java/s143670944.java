import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
    //n--;
    long i = 0;
    //答えはこのリストに集約
    ArrayList<Character> name = new ArrayList<Character>();

    while(n>0) {
      n--;  //1から始まるので調整(while文の中で引くのはn=1の時も処理を行うため)
      i = n % 26;
      name.add((char)(i + 'a'));  //余りとアルファベットの紐付け
      n /= 26;
    }
    Collections.reverse(name);  //リストを反転させる
    for(char c: name) {
      System.out.print(c);
    }

    //もっと簡潔にかける(上記)
    /*
    ArrayList<Long> name = new ArrayList<Long>();

    //String base26 = Integer.toString(n-1, 26);

    while(n > 0) {
      long tmp = n % 26;
      n /= 26;
      /*if(i==0){
        tmp++;
      }
      if(tmp == 0){
        tmp += 97;
      }else {
        tmp += 96;
      }
      name.add(tmp);
      i++;
    }

    //listから配列へ変換(int)
    long[] hoge = new long[name.size()];
    for(int j=0; j<name.size();j++) {
      hoge[j] = name.get(j);
    }
    //System.out.println(name.get(0));
    //System.out.println(hoge[0]);

    String[] ansname =new String[name.size()];
    //数値をストリングに変換して， 文字列配列にいれる
    for(int j=0; j<name.size();j++) {
      String ans = Character.toString((char) hoge[j]);
      ansname[name.size()-j-1] = ans;
    }
    for(int j=0; j<name.size();j++) {
      System.out.print(ansname[j]);
    }
    */
	}
}
