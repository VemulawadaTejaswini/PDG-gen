#include <stdio.h>
int main()
{
	int a, b, ans;
	char c;
	while (1)
	{
		scanf("%d %d %c", &a, &b, &c);
		if (c == '+')
		{
			ans = a + b;
		}
		else if (c == '-')
		{
			ans = a - b;
		}
		else if (c == '*')
		{
			ans = a * b;
		}
		else if (c == '/')
		{
			ans = a / b;
		}
		else if (c == '?')
		{
			return 0;
		}
                printf("%d", ans);
        }
	return 0;
}