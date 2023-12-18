#include <string>
#include <iostream>

using namespace std;

void b()
{
	string S;

	cin >> S;
	int k = S.length();

	int count = 0;
	for (int i = 0; i < k; i++) {
		if (S[i] == 'o')
			count++;
	}

	std::cout << (count+(15-k) >= 8 ? "YES" : "NO") << std::endl;
}
int main()
{
	b();
}

