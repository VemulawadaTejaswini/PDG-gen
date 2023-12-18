// inputに入力データ全体が入る
function Main(input) {
	// input に a,b,c がそれぞれ１つ存在すること
    array=input.split("");
    if(array.sort().toString() =='abc'){
      console.log("Yes");
    }else{
      console.log("No");
    }

}
//*この行以降は編集しないでください（標準入出力から一度に読み込み、Mainを呼び出します）
Main(require("fs").readFileSync("/dev/stdin", "utf8"));