#include<iostream>
using namespace std; // 575

int main() {
	int N;
	cin >> N;
	int M = N * (N - 1) / 2 - N / 2;
	cout << M << endl;
	for (int i = 1;i <= N;++ i) {
		for (int j = i + 1;j <= N;++ j) {
			if (i + j != N / 2 * 2 + 1) cout << i << " " << j << endl;
		}
	}
	return 0;
}
/*
31536000のコメント解説欄
ここテンプレで用意してるから、A問題とかだとこの先空欄の危険あり
また、コンテスト後に https://31536000.hatenablog.com/ で解説していると思うので、良かったら読んでねー

やるだけ
*/