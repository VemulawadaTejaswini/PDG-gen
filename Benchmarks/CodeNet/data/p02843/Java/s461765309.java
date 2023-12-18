using System;

public class Program{

  public static void Main(){

    var X = int.Parse(Console.ReadLine());
    int va = 100;
    int vb = 101;
    int vc = 102;
    int vd = 103;
    int ve = 104;
    int vf = 105;

    // まず100未満の金額が出せる組み合わせを全探索する
    // 見つかった組み合わせに対し、合計金額が超えていないか確認
    // 超えていなければ完了、超えていれば次のループ
    // これでやれば少なくとも99回のループで済む

    int result = 0;
    for (int a = 0; a < 100; a++) {
      var sumA = a * 101;
      if (sumA > X) break;
    for (int b = 0; b < 100; b++) {
      var sumB = a * 101 + b * 102;
      if (sumB > X) break;
    for (int c = 0; c < 100; c++) {
      var sumC = a * 101 + b * 102 + c * 103;
      if (sumC > X) break;
    for (int d = 0; d < 100; d++) {
      var sumD = a * 101 + b * 102 + c * 103 + d * 104;
      if (sumD > X) break;
    for (int e = 0; e < 100; e++) {
      var sumE = a * 101 + b * 102 + c * 103 + c * 104 + e * 105;
      if (sumE > X) break;


      if(sumE % 100 == X % 100){
        result = 1;
        goto End;
      }

    }
    }
    }
    }
    }

End:;
    Console.WriteLine(result);
  }
}
