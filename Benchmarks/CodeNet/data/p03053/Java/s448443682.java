#include <iostream>
#include <string>
#include <algorithm>
#include <cmath>
#include <cstdlib>
#include <vector>
#include <map>
#include <queue> 

using namespace std;
#define rep(i, s, e) for (int(i) = (s); (i) <= (e); ++(i))

int main()
{
	int h, w, counter = 0;
	cin >> h >> w;
	vector<string> a(h);
	rep(i, 0, h - 1)
	{
		cin >> a[i];
	}
	queue<pair<int, int>> q;
	int dx[] = { 1,0,-1,0 };
	int dy[] = { 0,1,0,-1 };
	vector<string> checker(h);
	rep(i, 0, h - 1)
	{
		string s = "";
		rep(j, 0, w - 1)
		{
			s += "#";
		}
		checker[i] = s;
	}
	rep(i, 0, h - 1)rep(j, 0, w - 1)
	{
		if (a[i][j] == '#')q.push({ i,j });
	}
	while (!q.empty())
	{
		if (a == checker)
		{
			break;
		}
		vector<pair<int, int>> vec;
		while (!q.empty())
		{
			int y = q.front().first;
			int x = q.front().second;
			vec.push_back({ y,x });
			q.pop();
		}
		rep(i, 0, vec.size() - 1)
		{
			rep(j, 0, 3)
			{
				int ny = vec[i].first + dy[j];
				int nx = vec[i].second + dx[j];
				if (0 <= ny && ny < h && 0 <= nx && nx < w && a[ny][nx] == '.')
				{
					a[ny][nx] = '#';
					q.push({ ny,nx });
				}
			}
		}
		++counter;
	}
	cout << counter << endl;
}